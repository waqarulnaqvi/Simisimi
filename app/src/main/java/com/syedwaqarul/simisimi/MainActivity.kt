package com.syedwaqarul.simisimi
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.syedwaqarul.simisimi.ui.theme.Navigation.Bottom_Navigation



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Bottom_Navigation()
//            MyApp()
        }
    }
}

//@Composable
//fun MyApp(modifier: Modifier = Modifier) {
//    Scaffold(modifier = Modifier.fillMaxSize()) {
//        it
//        var navHostController = rememberNavController()
//        androidx.navigation.(navHostController = navHostController)
//    }
//
//
//}

//import android.icu.text.CaseMap.Title
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material.icons.outlined.Email
//import androidx.compose.material.icons.outlined.Home
//import androidx.compose.material.icons.outlined.Settings
//import androidx.compose.material3.Badge
//import androidx.compose.material3.BadgedBox
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.tooling.preview.Preview
//import com.syedwaqarul.simisimi.ui.theme.Screens.Discover_Screen
//import com.syedwaqarul.simisimi.ui.theme.SimiSimiTheme
//
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.BadgedBox
//import androidx.compose.material3.Badge
//import androidx.compose.material3.Icon
//
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//
//import androidx.compose.runtime.remember
//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            SimiSimiTheme {
//                val items = listOf(
//                    BottomNavigationItem(
//                        title = "Home",
//                        selectedIcon = Icons.Filled.Home,
//                        unselectedIcon = Icons.Outlined.Home,
//                        hasNews = false
//                    ),
//                    BottomNavigationItem(
//                        title = "Chat",
//                        selectedIcon = Icons.Filled.Email,
//                        unselectedIcon = Icons.Outlined.Email,
//                        hasNews = false,
//                        badgeCount = 45
//                    ),
//                    BottomNavigationItem(
//                        title = "Settings",
//                        selectedIcon = Icons.Filled.Settings,
//                        unselectedIcon = Icons.Outlined.Settings,
//                        hasNews = true
//                    )
//                )
//                var selectedItemIndex by rememberSaveable {
//                    mutableStateOf(0)
//                }
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//
//                }
//            }
//            Scaffold(
//                bottomBar = {
//                    NavigationBar {
//                        items.forEachIndexed { index, item ->
//                            NavigationBarItem(
//                                selected = selectedItemIndex == index,
//                                onClick = {
//                                    selectedItemIndex = index
////                                    navController.navigate(item.title)
//                                },
//                                label={
//                                    Text(text = item.title)
//                                },
////                                alwaysShowLabel = false,//this is not recommended
//                                icon = {
//                                    BadgedBox(
//                                        badge = {
//                                       if(item.badgeCount!=null)
//                                       {
//                                           Badge {
//                                               Text(text = item.badgeCount.toString())
//                                           }
//                                       }
//                                            else if(item.hasNews)
//                                       {
//                                                Badge()
//                                       }
//                                        }
//                                    ) {
//                                        Icon(
//                                            imageVector = if (index == selectedItemIndex) {
//                                                item.selectedIcon
//                                            } else item.unselectedIcon
//                                            ,
//                                            contentDescription =item.title
//                                        )
//                                    }
//                                })
//                        }
//
//                    }
//                }
//            ) {
//            }
////            Discover_Screen()
//        }
//    }
//}
//
//data class BottomNavigationItem(
//    val title: String,
//    val selectedIcon: ImageVector,
//    val unselectedIcon: ImageVector,
//    val hasNews: Boolean,
//    val badgeCount: Int? = null
//)
//
//
