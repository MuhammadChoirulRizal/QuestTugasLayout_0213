package com.example.questtugaslayout

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 1. Fungsi Card terpisah sesuai aturan tugas
@Composable
fun ProfileCardItem(
    @StringRes nameRes: Int,
    @StringRes phoneRes: Int?,
    @StringRes addressRes: Int,
    @ColorRes bgColorRes: Int,
    @ColorRes textColorRes: Int
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 12.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(bgColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val gambar = painterResource(R.drawable.logo_umy)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(all = 5.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(nameRes),
                    fontSize = 24.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.text_white),
                    modifier = Modifier.padding(top = 5.dp)
                )
                if (phoneRes != null) {
                    Text(
                        text = stringResource(phoneRes),
                        fontSize = 16.sp,
                        color = colorResource(textColorRes),
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }
                Text(
                    text = stringResource(addressRes),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(textColorRes),
                    modifier = Modifier.padding(top = 2.dp, bottom = 5.dp)
                )
            }
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(all = 5.dp)
            )
        }
    }
}

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.Prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.Univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        // Kartu 1 (Tanpa No HP)
        ProfileCardItem(
            nameRes = R.string.nama_1,
            phoneRes = null,
            addressRes = R.string.alamat_1,
            bgColorRes = R.color.card_bg_grey,
            textColorRes = R.color.text_yellow
        )

        // Kartu 2
        ProfileCardItem(
            nameRes = R.string.nama_2,
            phoneRes = R.string.no_hp_2,
            addressRes = R.string.alamat_2,
            bgColorRes = R.color.card_bg_purple,
            textColorRes = R.color.text_cyan
        )

        // Kartu 3
        ProfileCardItem(
            nameRes = R.string.nama_3,
            phoneRes = R.string.no_hp_3,
            addressRes = R.string.alamat_3,
            bgColorRes = R.color.card_bg_blue,
            textColorRes = R.color.text_cyan
        )

        // Kartu 4
        ProfileCardItem(
            nameRes = R.string.nama_4,
            phoneRes = R.string.no_hp_4,
            addressRes = R.string.alamat_4,
            bgColorRes = R.color.card_bg_green,
            textColorRes = R.color.text_cyan
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.copy),
                modifier = Modifier
                    .padding(bottom = 50.dp)
            )
        }
    }

}