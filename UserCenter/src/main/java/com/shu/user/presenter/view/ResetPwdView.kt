package com.shu.user.presenter.view

import com.shu.base.presenter.view.BaseView

/**
 * Created by wangshufu on 2018/3/21.
 */
open interface ResetPwdView : BaseView {


    fun resetPwdSuc()

    fun pwdNotEquals()


}