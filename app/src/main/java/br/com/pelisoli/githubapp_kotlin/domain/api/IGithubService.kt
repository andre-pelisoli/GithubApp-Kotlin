package br.com.pelisoli.githubapp_kotlin.domain.api

import br.com.pelisoli.githubapp_kotlin.domain.model.Repository
import br.com.pelisoli.githubapp_kotlin.domain.model.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by pelisoli on 1/19/18.
 */
interface IGithubService {

    @GET("/users/{username}/repos")
    fun getUserRepos(@Path("username") userName : String ) : Observable<List<Repository>>

    @GET("/users/{username}")
    fun getUser(@Path("username") userName : String) : Observable<User>
}