package com.github.takahirom.dagger.hilt.multimodule.sample

import com.github.takahirom.feature.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

  @Provides
  @AppHash
  fun provideHash(): String {
      return hashCode().toString()
  }
}