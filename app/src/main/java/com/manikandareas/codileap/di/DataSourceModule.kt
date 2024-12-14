package com.manikandareas.codileap.di

import android.content.Context
import android.service.autofill.UserData
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.manikandareas.codileap.auth.data.AuthDataSourceImpl
import com.manikandareas.codileap.auth.data.networking.RemoteAuthDataSource
import com.manikandareas.codileap.core.data.preference.PreferenceDataSource
import com.manikandareas.codileap.auth.domain.AuthDataSource
import com.manikandareas.codileap.chatbot.data.netowrking.RemoteVirtualAssistantDataSource
import com.manikandareas.codileap.chatbot.domain.VirtualAssistantDataSource
import com.manikandareas.codileap.courses.data.networking.RemoteCoursesDataSource
import com.manikandareas.codileap.courses.data.networking.RemoteLearningPathDataSource
import com.manikandareas.codileap.courses.domain.CoursesDataSource
import com.manikandareas.codileap.courses.domain.LearningPathDataSource
import com.manikandareas.codileap.quiz.data.networking.RemoteQuizDataSource
import com.manikandareas.codileap.quiz.domain.QuizDataSource
import com.manikandareas.codileap.user.data.networking.RemoteProgressDataSource
import com.manikandareas.codileap.user.data.networking.RemoteUserDataSource
import com.manikandareas.codileap.user.domain.ProgressDataSource
import com.manikandareas.codileap.user.domain.UserDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.core.module.dsl.singleOf
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.module

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "preferences")

fun provideDataStore(context: Context): DataStore<Preferences> = context.dataStore


fun providePreferenceDataSource(
    dataStore: DataStore<Preferences>,
    ioDispatcher: CoroutineDispatcher
): PreferenceDataSource = PreferenceDataSource(dataStore, ioDispatcher)

val dataSourceModule = module {
    single(named("IODispatcher")) {
        Dispatchers.IO
    }
    single { provideDataStore(get()) }
    singleOf(::RemoteAuthDataSource)
    singleOf(::AuthDataSourceImpl).bind<AuthDataSource>()
    factory { providePreferenceDataSource(get(), get(named("IODispatcher"))) }

    singleOf(::RemoteLearningPathDataSource).bind<LearningPathDataSource>()
    singleOf(::RemoteProgressDataSource).bind<ProgressDataSource>()
    singleOf(::RemoteCoursesDataSource).bind<CoursesDataSource>()
    singleOf(::RemoteQuizDataSource).bind<QuizDataSource>()
    singleOf(::RemoteUserDataSource).bind<UserDataSource>()
    singleOf(::RemoteVirtualAssistantDataSource).bind<VirtualAssistantDataSource>()

}