package com.tangyh.lamp.common.cache.common;


import com.tangyh.basic.cache.model.CacheKeyBuilder;
import com.tangyh.lamp.common.cache.CacheKeyDefinition;

/**
 * εζ° KEY
 * <p>
 * {tenant}:dictionary_type:{type} - {code} --> id
 * <p>
 * #c_dictionary_item
 *
 * @author zuihou
 * @date 2020/9/20 6:45 δΈε
 */
public class DictionaryTypeCacheKeyBuilder implements CacheKeyBuilder {
    @Override
    public String getPrefix() {
        return CacheKeyDefinition.DICTIONARY_TYPE;
    }


}
