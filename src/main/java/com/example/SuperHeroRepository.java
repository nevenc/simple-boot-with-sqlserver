package com.example;

import com.example.domain.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(
        collectionResourceRel = "heroes",
        collectionResourceDescription = @Description("SuperHeroes"),
        itemResourceRel = "hero",
        itemResourceDescription = @Description("SuperHero"),
        path = "heroes"
)
public interface SuperHeroRepository extends JpaRepository<SuperHero, Long> {
    List<SuperHero> findByNameContains(@Param("name") String name);
    List<SuperHero> findByPowerContains(@Param("power") String power);
}
