package com.flying.taokuang.service;

import com.flying.taokuang.dataobject.Collection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CollectionService {

    /**
     * 通过 id 删除
     * @param userId
     * @param collectionId
     * @return
     */
    int deleteByUserIdAndCollectionId(Integer userId, Integer collectionId);

    /**
     * 加入收藏
     * @param record
     * @return
     */
    int insert(Collection record);

    /**
     * 通过收藏品id查找
     * @param collectionId
     * @return
     */
    List<Collection> selectByCollectionId(String collectionId);

    /**
     * 通过收藏者id查找
     * @param collectorId
     * @return
     */
    List<Collection> selectByCollectorId(int collectorId);

    /**
     * 更新收藏
     * @param record
     * @return
     */
    int update(Collection record);
}