/*

   Derby - Class org.apache.derby.impl.services.cache.NonBlockingCacheFactory

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package org.apache.derby.impl.services.cache;

import org.apache.derby.iapi.services.cache.CacheFactory;
import org.apache.derby.iapi.services.cache.CacheManager;
import org.apache.derby.iapi.services.cache.CacheableFactory;
import org.apache.derby.iapi.services.sanity.SanityManager;

/**
 * Factory class which creates cache manager instances based on the
 * <code>NonBlockingCache</code> implementation.
 */
public final class NonBlockingCacheFactory implements CacheFactory {

    public NonBlockingCacheFactory() {}

    public CacheManager newCacheManager(CacheableFactory holderFactory, String name, int initialSize, int maximumSize) {
    	if(SanityManager.DEBUG) {
			SanityManager.DEBUG("CacheTrace", "NonBlockingCache (name: " + name
					+ ", initialSize: " + initialSize + ", initialSize: "
					+ initialSize + ")");
		}
    	return new NonBlockingCache(holderFactory, name, initialSize, maximumSize);
    }

}
