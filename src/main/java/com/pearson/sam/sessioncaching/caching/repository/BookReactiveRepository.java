/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pearson.sam.sessioncaching.caching.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.pearson.sam.sessioncaching.caching.document.Book;

/**
 * BookReactiveRepository interface.
 *
 * @author Raja Kolli
 * @since 0.1.1
 */
public interface BookReactiveRepository extends ReactiveMongoRepository<Book, String> {

}
