package com.dh.client;


import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@FeignClient(name="games")
public interface GamesServiceClient {

    List<GamesDto> getGamesByUser(Integer id);

    @Getter
    @Setter
    class GamesDto{
        public GamesDto() {
        }

        private Integer id;
        private String name;
        private String classification;
        private String developer;
        private String distributor;
    }


}
