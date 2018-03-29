package com.yeongsik.kotlinseminar.week3

sealed class MobileApp (val os: String) {
    class Android(os: String, val packageName: String) : MobileApp(os)
    class IOS(os: String, val bundleName: String) : MobileApp(os)
}

class Android2(os: String, val packageName: String) : MobileApp(os)
class IOS2(os: String, val bundleName: String) : MobileApp(os)