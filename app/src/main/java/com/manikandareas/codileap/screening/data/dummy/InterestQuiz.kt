package com.manikandareas.codileap.screening.data.dummy

import com.manikandareas.codileap.quiz.domain.AnswerOption
import com.manikandareas.codileap.quiz.domain.Question
import com.manikandareas.codileap.quiz.domain.Quiz

import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.util.Date

val interestQuestionsQuiz = Quiz(
    id = 1,
    courseId = 101,
    title = "Interest Profile Quiz",
    description = "Discover your tech interest profile",
    totalQuestions = 5,
    passingScore = 3,
    timeLimit = 15,
    createdAt = ZonedDateTime.now().toString(),
    updatedAt = ZonedDateTime.now().toString(),
    questions = listOf(
        Question(
            id = 1,
            quizId = 1,
            text = "Mana kegiatan yang paling relate denganmu di pagi hari?",
            pointValue = 1,
            createdAt = LocalDateTime.now().toString(),
            updatedAt = LocalDateTime.now().toString(),
            answerOptions = listOf(
                AnswerOption(id = 1, questionId = 1, text = "Mencoba membuat menu sarapan", isCorrect = false),
                AnswerOption(id = 2, questionId = 1, text = "Baca atau lihat info viral dari berbagai sumber", isCorrect = false),
                AnswerOption(id = 3, questionId = 1, text = "Membersihkan kamar", isCorrect = false),
                AnswerOption(id = 4, questionId = 1, text = "Coret-coret atau menulis di buku", isCorrect = false)
            )
        ),
        Question(
            id = 2,
            quizId = 1,
            text = "Jika sedang menghadapi masalah, cara mana yang paling mirip denganmu?",
            pointValue = 1,
            createdAt = LocalDateTime.now().toString(),
            updatedAt = LocalDateTime.now().toString(),
            answerOptions = listOf(
                AnswerOption(id = 5, questionId = 2, text = "Coba berbagai cara sampai menemukan solusinya", isCorrect = false),
                AnswerOption(id = 6, questionId = 2, text = "Cari tahu masalahnya dari berbagai macam sudut pandang", isCorrect = false),
                AnswerOption(id = 7, questionId = 2, text = "Membuat catatan untuk menyelesaikan masalahnya", isCorrect = false),
                AnswerOption(id = 8, questionId = 2, text = "Ngobrol dengan teman untuk mendapatkan ide baru", isCorrect = false)
            )
        ),
        Question(
            id = 3,
            quizId = 1,
            text = "Kalau lagi bermain sosial media, mana aktivitas yang paling relate denganmu?",
            pointValue = 1,
            createdAt = LocalDateTime.now().toString(),
            updatedAt = LocalDateTime.now().toString(),
            answerOptions = listOf(
                AnswerOption(id = 9, questionId = 3, text = "Mencoba fitur baru yang ada di aplikasi", isCorrect = false),
                AnswerOption(id = 10, questionId = 3, text = "Stalking akun-akun yang suka share fakta-fakta seru", isCorrect = false),
                AnswerOption(id = 11, questionId = 3, text = "Membersihkan feeds timeline dan followers agar rapih", isCorrect = false),
                AnswerOption(id = 12, questionId = 3, text = "Share-share postingan teman sambil comment", isCorrect = false)
            )
        ),
        Question(
            id = 4,
            quizId = 1,
            text = "Nah, kalau lagi liburan, kegiatan mana yang paling bikin kamu excited?",
            pointValue = 1,
            createdAt = LocalDateTime.now().toString(),
            updatedAt = LocalDateTime.now().toString(),
            answerOptions = listOf(
                AnswerOption(id = 13, questionId = 4, text = "Mencoba hal-hal baru yang lagi terkenal", isCorrect = false),
                AnswerOption(id = 14, questionId = 4, text = "Mencari review tempat yang akan dikunjungi", isCorrect = false),
                AnswerOption(id = 15, questionId = 4, text = "Menyusun itinerary secara detail", isCorrect = false),
                AnswerOption(id = 16, questionId = 4, text = "Membuat konten blog atau vlog tentang petualangan liburan", isCorrect = false)
            )
        ),
        Question(
            id = 5,
            quizId = 1,
            text = "Kalau lagi kerja bareng tim, mana peran yang paling mirip dengamu?",
            pointValue = 1,
            createdAt = LocalDateTime.now().toString(),
            updatedAt = LocalDateTime.now().toString(),
            answerOptions = listOf(
                AnswerOption(id = 17, questionId = 5, text = "Jadi orang yang suka coba cara-cara baru", isCorrect = false),
                AnswerOption(id = 18, questionId = 5, text = "Jadi orang yang bantu tim ngambil keputusan dengan analisis situasi", isCorrect = false),
                AnswerOption(id = 19, questionId = 5, text = "Jadi koordinator yang memastikan semuanya lancar", isCorrect = false),
                AnswerOption(id = 20, questionId = 5, text = "Jadi orang yang bikin presentasi buat menyampaikan ide-ide tim", isCorrect = false)
            )
        )
    )
)