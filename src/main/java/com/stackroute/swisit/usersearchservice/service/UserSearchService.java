package com.stackroute.swisit.usersearchservice.service;
/*-----------Importing Libraries------------*/
import com.stackroute.swisit.usersearchservice.domain.UserInput;
import com.stackroute.swisit.usersearchservice.domain.UserSearchResult;

import java.util.List;

/*-------User Search Service Interface Class--------*/
public interface UserSearchService {
    public List<UserSearchResult> fetchNeoData(UserInput userInput);
}
