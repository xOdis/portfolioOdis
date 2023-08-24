package com.odis.portfolio.pages

import androidx.compose.runtime.*
import com.odis.portfolio.Models.Theme
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    // TODO: Add content here
    Box (
        modifier = Modifier.width(200.px).height(200.px).backgroundColor(Theme.Primary.rgb)
    ){  }
}
