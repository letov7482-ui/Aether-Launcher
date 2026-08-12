/*
 * Zalith Launcher 2
 * Copyright (C) 2025 MovTery <movtery228@qq.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/gpl-3.0.txt>.
 */

package com.movtery.zalithlauncher.ui.theme

import androidx.compose.ui.graphics.Color

data class ColorTheme(
    val embermire: Color,
    val velvetRose: Color,
    val mistwave: Color,
    val glacier: Color,
    val verdantField: Color,
    val urbanAsh: Color,
    val verdantDawn: Color
)

enum class ColorThemeType {
    DYNAMIC,
    EMBERMIRE,
    VELVET_ROSE,
    MISTWAVE,
    GLACIER,
    VERDANTFIELD,
    URBAN_ASH,
    VERDANT_DAWN,
    GOLDEN,    // <-- наша новая тема
    CUSTOM
}

// Тема Aether (золотая)
val GoldenTheme = ColorTheme(
    embermire = Color(0xFFFFD700),   // Золотой (основной)
    velvetRose = Color(0xFFFFB300),  // Тёмно-золотой
    mistwave = Color(0xFF0A0A0F),    // Глубокий тёмный (фон)
    glacier = Color(0xFF1A1A2E),     // Тёмно-синий (карточки)
    verdantField = Color(0xFF000000),// Чёрный (текст на золотом)
    urbanAsh = Color(0xFF2A2A2A),    // Серый (для второстепенных элементов)
    verdantDawn = Color(0xFF3F3F3F)  // Светло-серый
)
