package com.manikandareas.codileap.user.data.networking.dto

data class GetUserBadgesResponseDto(
    val earnedBadges: List<EarnedBadgeDto>,
    val availableBadges: List<AvailableBadgeDto>
)

data class EarnedBadgeDto(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val earnedAt: String
)

data class AvailableBadgeDto(
    val id: Int,
    val title: String,
    val description: String,
    val requirements: List<String>
)
