package com.rick.scaffold.common.search.biz.user;

import com.rick.scaffold.common.search.biz.SearchKeywords;
import com.rick.scaffold.common.search.biz.SearchResult;
import com.rick.scaffold.core.entity.user.User;

public interface UserSearch {

	void createIndex(User user);

	void deleteIndex(String id);

	/**
	 * Similar keywords based on a a series of characters. Used in the auto-complete
	 * functionality
	 * @param collectionName
	 * @param jsonString
	 * @param entriesCount
	 * @return
	 * @throws ServiceException
	 */
	SearchKeywords searchForKeywords(String collectionName, String jsonString, int entriesCount);

	/**
	 * Search products based on user entry
	 * @param store
	 * @param languageCode
	 * @param jsonString
	 * @param entriesCount
	 * @param startIndex
	 * @throws ServiceException
	 */
	SearchResult search(String jsonString, int entriesCount, int startIndex);

	/**
	 * Initializes search service in order to avoid lazy initialization
	 */
	void initService();

}
