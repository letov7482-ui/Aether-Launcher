package com.movtery.zalithlauncher.ui.screens.login

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.movtery.zalithlauncher.account.AccountUtils
import com.movtery.zalithlauncher.account.OfflineAccount

@Composable
fun OfflineLoginButton() {
    Button(onClick = {
        val account = OfflineAccount("Player")
        AccountUtils.addAccount(account)
        AccountUtils.setSelectedAccount(account)
        // После добавления можно закрыть экран входа или обновить список
    }) {
        Text("Offline Account")
    }
}
