package org.jakos.designpatterns.structural.proxy.service;

import org.jakos.designpatterns.structural.proxy.service.dto.ResourceDto;

import java.util.HashSet;
import java.util.Set;

public class ProxyService implements SomeService {

    private RealService realService;
    private Set<ResourceDto> computedResources;

    @Override
    public ResourceDto loadResources(ResourceDto resource) {
        if (resource == null) {
            return null;
        }
        if (resource.getId() > 5L) {
            throw new IllegalArgumentException("id above 5 cannot access this service");
        }
        if (realService == null) {
            realService = new RealService();
        }
        if (computedResources == null) {
            computedResources = new HashSet<>();
        }
        if (computedResources.contains(resource)) {
            for (ResourceDto resourceDto : computedResources) {
                if (!resource.equals(resourceDto)) {
                    continue;
                }
                System.out.println("proxy has the computed value, do not run resource heavy computation");
                return resourceDto;
            }
        }
        ResourceDto newlyComputedDto = realService.loadResources(resource);
        computedResources.add(newlyComputedDto);
        return newlyComputedDto;
    }
}
