package org.example.dagger.modules;

import dagger.Module;
import dagger.Provides;
import org.example.DependencyEntity;

import javax.inject.Singleton;

@Module
public class DependentEntityClientProvider {

    @Provides
    @Singleton
    public DependencyEntity providesDependentEntity(){
        return new DependencyEntity();
    }
}
