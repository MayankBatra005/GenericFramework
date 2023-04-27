package org.example.dagger.components;

import dagger.Component;
import org.example.DependencyEntity;
import org.example.dagger.modules.DependencyModule;
import org.example.dagger.modules.DependentEntityClientProvider;

import javax.inject.Singleton;

/**
 *  a component, which is an interface used to generate the injector
 */

@Singleton
@Component(modules = {
        DependencyModule.class ,
        DependentEntityClientProvider.class
        })
public interface DependencyComponent {
        DependencyEntity buildEntity();
}
