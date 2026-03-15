package com.example.libraryapp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class User(
    val name: String,
    val balance: Double
)

data class Transaction(
    val name: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)

object FinanceColors {
    val Background     = Color(0xFFF7F7F7)
    val CardGreen      = Color(0xFFE8F4EF)
    val CardCream      = Color(0xFFF5EDE0)
    val CardLavender   = Color(0xFFE8E4F4)
    val TextPrimary    = Color(0xFF1A1A1A)
    val TextSecondary  = Color(0xFF9E9E9E)
    val TextCardMuted  = Color(0xFFAAAAAA)
    val IconBg         = Color(0xFF1C1C1C)
    val AvatarBg       = Color(0xFFEFE8DC)
    val Divider        = Color(0xFFEEEEEE)
}
