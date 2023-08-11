package honeyloose.demo.repository;

import honeyloose.demo.entity.ChampionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ChampionRepository extends  JpaRepository<ChampionEntity, Long> {
    List<ChampionEntity> findById(long length);
    List<ChampionEntity> findByName(String name);

    List<ChampionEntity> findByLengthOfName(int length);


}
