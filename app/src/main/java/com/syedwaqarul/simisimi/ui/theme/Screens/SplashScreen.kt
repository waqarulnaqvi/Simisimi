package com.syedwaqarul.navapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SplashScreen(

    onContinueClick :() ->Unit={}//function used for event hoisting
)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .background(Color.Cyan)
            .padding(16.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "My Splash Screen",
            style = MaterialTheme.typography.displaySmall)

        Spacer(modifier = Modifier.height(100.dp))
        FilledIconButton(onClick = onContinueClick)
        {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription ="" )


        }
    }

}

//you should start all event handling function using "on" keyword

@Preview(showSystemUi = true)
@Composable
fun SplashScreenprev() {
SplashScreen()

}