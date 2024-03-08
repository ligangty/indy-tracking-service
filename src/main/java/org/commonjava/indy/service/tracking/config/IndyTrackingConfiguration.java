/**
 * Copyright (C) 2022-2023 Red Hat, Inc. (https://github.com/Commonjava/indy-tracking-service)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.indy.service.tracking.config;

import io.quarkus.runtime.Startup;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

import jakarta.enterprise.context.ApplicationScoped;
import java.io.File;

@Startup
@ConfigMapping( prefix = "tracking" )
@ApplicationScoped
public interface IndyTrackingConfiguration
{
    @WithName( "baseDir" )
    File baseDir();

    @WithName( "content-service.url" )
    String contentServiceURL();

    @WithName( "track.group.content" )
    @WithDefault( "true" )
    Boolean trackGroupContent();

    @WithName( "deletionAdditionalGuardCheck" )
    @WithDefault( "false" )
    Boolean deletionAdditionalGuardCheck();

}
