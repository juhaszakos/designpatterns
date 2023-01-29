package org.jakos.designpatterns.structural.proxy.service;

import org.jakos.designpatterns.structural.proxy.service.dto.ResourceDto;

public interface SomeService {
    ResourceDto loadResources(ResourceDto resource);
}
