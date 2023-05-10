# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#不混淆某个类

#这个报错是因为app没有依赖base的问题----但是并不妨碍使用的问题
-keep public class m.tech.base.BaseFragment3 { *; }
-keep public class com.github.takahirom.feature.WillErrorFragment { *; }
-keep public class com.github.takahirom.dagger.hilt.multimodule.sample.feature.databinding.FragmentWillErrorBinding { *; }
