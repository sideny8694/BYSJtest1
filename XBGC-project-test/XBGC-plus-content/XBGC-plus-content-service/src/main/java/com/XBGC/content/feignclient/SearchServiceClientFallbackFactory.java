package com.XBGC.content.feignclient;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Mr.w
 * @version 1.0
 * @description TODO
 * @date 2025/2/1/22 14:50
 */
@Slf4j
@Component
public class SearchServiceClientFallbackFactory implements FallbackFactory<SearchServiceClient> {
    @Override
    public SearchServiceClient create(Throwable throwable) {
        return new SearchServiceClient() {
            @Override
            public Boolean add(CourseIndex courseIndex) {
                log.error("添加课程索引发生熔断,索引信息:{},熔断异常:{}",courseIndex,throwable.toString(),throwable);
                //走降级了返回 false
                return false;
            }
        };
    }
}
