package com.Varun.joblisting.repository;

import com.Varun.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}