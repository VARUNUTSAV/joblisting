package com.Varun.joblisting.repository;
import com.Varun.joblisting.model.Post;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
