package com.movtery.zalithlauncher.account

import com.movtery.zalithlauncher.utils.ToastUtils

object OfflineAccountHelper {
    fun addOfflineAccount() {
        val account = OfflineAccount("Player")
        AccountUtils.addAccount(account)
        AccountUtils.setSelectedAccount(account)
        ToastUtils.showToast("Офлайн-аккаунт добавлен")
    }
}
