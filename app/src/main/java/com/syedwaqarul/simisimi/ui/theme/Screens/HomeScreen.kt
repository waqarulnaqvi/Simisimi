package com.syedwaqarul.navapp.Screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(

    onNext :() ->Unit={},//function used for event hoisting
    onBackPressed:()->Unit={}
    )
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .background(Color.Yellow)
            .padding(16.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
//                    .background(color = MaterialTheme.colorScheme.tertiaryContainer)
                    .padding(16.dp)
            ) {

                IconButton(onClick = onBackPressed) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")

                }
            }
        Column(
            modifier = Modifier.weight(1f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "😒 Home Screen",
                style = MaterialTheme.typography.displaySmall
            )

            Spacer(modifier = Modifier.height(100.dp))
            OutlinedButton(onClick = onNext)
            {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                Text(text = "My Profile")


            }
        }
    }

}

//you should start all event handling function using "on" keyword

@Preview(showSystemUi = true)
@Composable
fun HomeScreenprev() {
    HomeScreen()

}

//shift+f6- all the thing related to that thing will be change