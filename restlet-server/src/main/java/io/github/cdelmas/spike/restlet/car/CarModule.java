/*
   Copyright 2015 Cyril Delmas

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package io.github.cdelmas.spike.restlet.car;

import com.google.inject.AbstractModule;
import io.github.cdelmas.spike.common.domain.CarRepository;
import io.github.cdelmas.spike.common.persistence.InMemoryCarRepository;
import org.restlet.Application;

public class CarModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Application.class).annotatedWith(Car.class).to(CarApplication.class);
        bind(CarRepository.class).to(InMemoryCarRepository.class);
    }
}
