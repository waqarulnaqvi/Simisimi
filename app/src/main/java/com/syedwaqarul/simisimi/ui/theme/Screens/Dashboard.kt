package com.syedwaqarul.simisimi.ui.theme.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syedwaqarul.simisimi.R

@Composable
fun DashboardScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
//            .background(Color.hsl(100f,100f,100f))
            .background(color = Color.Yellow)
            .padding(8.dp)
    ) {
 item {
     Row(
         horizontalArrangement = Arrangement.SpaceBetween,
         modifier = Modifier
             .fillMaxWidth()
             .padding(16.dp),
         verticalAlignment = Alignment.CenterVertically
     ) {
         Icon(
             painter = painterResource(id = R.drawable.bar_chart),
             contentDescription = "",
             modifier = Modifier.size(40.dp)
         )
         Icon(
             painter = painterResource(id = R.drawable.extinguisher),
             contentDescription = "",
             modifier = Modifier
                 .size(50.dp)
                 .background(
                     Color.White,
                     shape = CircleShape
                 )
                 .padding(16.dp)

         )

     }
//Title
     Row {
         Text(
             text = "Financial Dashboard",

//                fontSize = 70.sp,
             style = MaterialTheme.typography.displayLarge,
             fontWeight = FontWeight.Medium,
             modifier = Modifier.padding(8.dp),
             fontFamily = FontFamily.Serif
//                lineHeight = 70.sp

         )
     }

     Row(
         horizontalArrangement = Arrangement.SpaceBetween,
         modifier = Modifier
             .fillMaxWidth()
             .padding(6.dp),
         verticalAlignment = Alignment.CenterVertically
     ) {
         Column {
             Text(
                 text = "$10,7k",
                 modifier = Modifier
                     .padding(5.dp),
                 fontSize = 50.sp,
                 fontWeight = FontWeight.Bold,
             )

             Text(
                 text = "Total Balance",
                 fontSize = 22.sp,
                 fontWeight = FontWeight.Medium,

                 )

         }
         Row(


         ) {
             Icon(
                 painter = painterResource(id = R.drawable.extinguisher),
                 contentDescription = "",
                 modifier = Modifier
                     .size(80.dp)
                     .background(
                         Color.White,
                         shape = CircleShape
                     )
                     .padding(16.dp)
                     .rotate(45f)
             )
             Icon(
                 painter = painterResource(id = R.drawable.share),
                 contentDescription = "",
                 modifier = Modifier
                     .offset(x = (-20).dp)
                     .size(80.dp)
                     .background(
                         Color.Black,
                         shape = CircleShape
                     )
                     .padding(16.dp)

//                        .rotate(45f)
                 ,
                 tint = Color.White
             )

         }
     }

     //Withdrawal and deposit
     Row(
         horizontalArrangement = Arrangement.spacedBy(8.dp),
         modifier = Modifier
             .fillMaxWidth()
             .padding(vertical = 16.dp)
//                .height(200.dp),
//                .background(Color.Black)
//            verticalAlignment = Alignment.CenterVertically
     ) {


         Box(
             contentAlignment = Alignment.Center,
             modifier = Modifier
                 .weight(1f)
                 .fillMaxWidth()
                 .background(
                     color = Color.White,
                     shape = MaterialTheme.shapes.extraLarge
                 )
         )

         {
             Column(
                 horizontalAlignment = Alignment.CenterHorizontally

             )
             {
                 Icon(
                     painter = painterResource(id = R.drawable.diagonal_arrow_up),
                     contentDescription = "",
                     modifier = Modifier
                         .size(70.dp)

                         .padding(16.dp)
                 )
                 Text(
                     text = "Withdrawal",
                     style = MaterialTheme.typography.headlineSmall,
                     modifier = Modifier.padding(8.dp)
                 )
             }
         }
         Box(
             contentAlignment = Alignment.Center,
             modifier = Modifier
                 .weight(1f)
                 .fillMaxWidth()
                 .background(
                     color = Color.White,
                     shape = MaterialTheme.shapes.extraLarge
                 )
         )

         {


             Column(
                 horizontalAlignment = Alignment.CenterHorizontally

             )
             {


                 Icon(
                     painter = painterResource(id = R.drawable.diagonal_down),
                     contentDescription = "",
                     modifier = Modifier
                         .size(70.dp)
                         .padding(16.dp)
                 )
                 Text(
                     text = "Deposit",
                     style = MaterialTheme.typography.headlineSmall,
                     modifier = Modifier.padding(8.dp)
                 )
             }


         }
     }

     Box(
         modifier = Modifier
//                    .weight(1f)
             .fillMaxWidth()

             .background(
                 color = Color.White,
                 shape = MaterialTheme.shapes.extraLarge
             )
     )
     {

         Column {


             Row(
                 horizontalArrangement = Arrangement.SpaceBetween,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(top = 20.dp)
                     .padding(bottom = 6.dp)
                     .padding(horizontal = 20.dp),
                 verticalAlignment = Alignment.CenterVertically
             ) {
                 Text(
                     text = "ust", style = MaterialTheme.typography.headlineSmall
                 )
                 Text(
                     text = "September", style = MaterialTheme.typography.headlineSmall

                 )
                 Text(
                     text = "Oct", style = MaterialTheme.typography.headlineSmall

                 )

             }

             Row(
                 horizontalArrangement = Arrangement.Center,
                 modifier = Modifier
                     .fillMaxWidth()

             ) {
                 Text(text = "Indicator")
             }


             Row(
                 horizontalArrangement = Arrangement.SpaceBetween,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(horizontal = 20.dp),
                 verticalAlignment = Alignment.CenterVertically
             ) {
                 Text(
                     text = "Transactions", style = MaterialTheme.typography.headlineSmall
                 )

                 Text(
                     text = "****4527", style = MaterialTheme.typography.headlineSmall

                 )

             }

             Row(
//                    horizontalArrangement = Arrangement.SpaceBetween,
                 modifier = Modifier
                     .padding(start = 20.dp)
                     .padding(bottom = 36.dp),
                 verticalAlignment = Alignment.Bottom

             ) {
                 Column {
                     Text(
                         text = "37",
                         style = MaterialTheme.typography.displayLarge,
                         fontFamily = FontFamily.Serif,
                         fontWeight = FontWeight.ExtraBold
                     )
                     Text(
                         text = "This month",
                         style = MaterialTheme.typography.headlineSmall
                     )

                 }
                 Row(
                     horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()

                 ) {

                     Image(
                         painter = painterResource(id = R.drawable.myself),
                         contentDescription = "",
                         modifier = Modifier
                             .offset(x = (30).dp)
                             .size(60.dp)
//                                .background(
//                                    Color.Black,
//                                    shape = CircleShape
//                                )
//                                .padding(16.dp)

                             .clip(RoundedCornerShape(62.dp)),
                         contentScale = ContentScale.Crop, // adjust as needed


//                        .rotate(45f)
//                            ,
//                            tint = Color.White
                     )

                     Image(
                         painter = painterResource(id = R.drawable.walt_disney),
                         contentDescription = "",
                         modifier = Modifier
                             .offset(x = (10).dp)
                             .size(60.dp)
//                                .background(
//                                    Color.Black,
//                                    shape = CircleShape
//                                )
//                                .padding(16.dp)

                             .clip(RoundedCornerShape(62.dp)),
                         contentScale = ContentScale.Crop, // adjust as needed


//                        .rotate(45f)
//                            ,
//                            tint = Color.White
                     )

                     Image(
                         painter = painterResource(id = R.drawable.er),
                         contentDescription = "",
                         modifier = Modifier
                             .offset(x = (-10).dp)
                             .size(60.dp)
//                                .background(
//                                    Color.Black,
//                                    shape = CircleShape
//                                )
//                                .padding(16.dp)

                             .clip(RoundedCornerShape(62.dp)),
                         contentScale = ContentScale.Crop, // adjust as needed

                     )


                     Text(
                         text = "+7",
                         modifier = Modifier
                             .offset(x = (-30).dp)
                             .size(60.dp)
                             .background(
                                 Color.Black,
                                 shape = CircleShape
                             )

                             .padding(16.dp),
                         color = Color.White,
                         fontSize = 20.sp,

                         )


                 }
             }
         }

     }

     Spacer(modifier = Modifier.height(20.dp))
     Column {
         Text(
             text = "Just for you",
             style = MaterialTheme.typography.headlineSmall,
             fontWeight = FontWeight.Bold
         )
         Spacer(modifier = Modifier.height(16.dp))

         Box(
             modifier = Modifier
//                    .weight(1f)
                 .width(260.dp)
                 .padding(10.dp)

                 .border(2.dp, Color.Gray, RoundedCornerShape(18.dp))
                 .background(

                     shape = MaterialTheme.shapes.large,
                     color = Color.White,

                     )
         )
         {

             Column(
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(10.dp)
                     .width(220.dp),

                 ) {


                 Image(
                     painter = painterResource(id = R.drawable.undraw_mobile_content_xvgr),
                     contentDescription = ""
                 )

                 Spacer(modifier = Modifier.height(14.dp))




                 Text(
                     text = "What makes great art, great",
                     style = MaterialTheme.typography.bodyLarge,
                     fontWeight = FontWeight.Bold,
                     fontSize = 15.sp
                 )
                 Spacer(modifier = Modifier.height(8.dp))

                 Text(
                     text = "The know-how to help you out",
                     fontSize = 12.sp,
                     color = Color.Gray,

                     )

                 Spacer(modifier = Modifier.height(16.dp))

                 Row {
                     Icon(
                         painter = painterResource(id = R.drawable.timer),
                         contentDescription = "",
                         Modifier.size(16.dp),
                         tint = Color.Black

                     )
                     Spacer(modifier = Modifier.width(4.dp))

                     Text(
                         text = "11 mins listen",
                         fontSize = 12.sp,
                         color = Color.Gray,


                         )
                     Spacer(modifier = Modifier.weight(1f))

                     Icon(
                         painter = painterResource(id = R.drawable.not_bookmark),
                         contentDescription = "", modifier = Modifier
                             .size(20.dp)
                             .padding(end = 2.dp),
                         tint = Color.Black
                     )

                 }


             }
         }
         Row(
             horizontalArrangement = Arrangement.SpaceBetween,
             verticalAlignment = Alignment.CenterVertically,
             modifier = Modifier.fillMaxWidth()
         )
         {
             Text(
                 text = "Art",
                 style = MaterialTheme.typography.headlineSmall,
                 fontWeight = FontWeight.Bold,
                 fontSize = 20.sp

             )

             Text(
                 text = "More",
                 style = MaterialTheme.typography.headlineSmall,
                 fontWeight = FontWeight.Bold,
                 color = Color.Gray,
                 fontSize = 18.sp
             )

         }
         Spacer(modifier = Modifier.height(20.dp))

         Row(
             horizontalArrangement = Arrangement.SpaceBetween,
             modifier = Modifier.fillMaxWidth()
         ) {

             Card(
                 color = Color.Cyan,
                 title = "Is art subjective or objective",
                 subtitle = "Let a contemporary artist inspire your creativity",
                 time = "4 mins listen",
                 tint = Color.Black,
                 bookmark = painterResource(id = R.drawable.not_bookmark),
                 tint2 = Color.Gray
             )

             Card()

         }
         Spacer(modifier = Modifier.height(20.dp))


     }
 }

    }
}


@Preview(showSystemUi = true)
@Composable
fun DashboardScreenPreview() {
        DashboardScreen()

}



@Composable
fun BulletListItem(index: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        BulletIndicator()
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Item $index", style = MaterialTheme.typography.headlineSmall)
    }
}

@Composable
fun BulletIndicator() {
    val diameter = with(LocalDensity.current) { 8.dp.toPx() }

    Canvas(
        modifier = Modifier
//            .size(diameter.toInt())
            .background(MaterialTheme.colorScheme.primary)
            .clip(CircleShape)
    ) {
        drawCircle(Color.White)
    }
}

//            Card(
//                elevation =CardDefaults.cardElevation(defaultElevation = 18.dp),
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxWidth()
//                    .padding(4.dp)
//                    .align(),
//                colors = CardDefaults.cardColors(
//                    containerColor = Color.White
//                )

//            )

//7 40 to 8 40