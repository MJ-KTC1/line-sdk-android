package com.linecorp.linesdk;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = TestConfig.TARGET_SDK_VERSION)
public abstract class LineSdkTestRunner {
}
