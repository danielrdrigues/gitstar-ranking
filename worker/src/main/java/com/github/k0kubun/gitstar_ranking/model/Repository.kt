package com.github.k0kubun.gitstar_ranking.model

class Repository {
    val id: Long
    private val ownerId: Int?
    private val name: String?
    private val fullName: String?
    private val description: String?
    private val fork: Boolean?
    private val homepage: String?
    val stargazersCount: Int
    private val language: String?

    constructor(id: Long, stargazersCount: Int) {
        this.id = id
        this.stargazersCount = stargazersCount
        ownerId = null
        name = null
        fullName = null
        description = null
        fork = null
        homepage = null
        language = null
    }

    constructor(id: Long, ownerId: Int?, name: String?, fullName: String?, description: String?,
                fork: Boolean?, homepage: String?, stargazersCount: Int, language: String?) {
        this.id = id
        this.ownerId = ownerId
        this.name = name
        this.fullName = fullName
        this.description = description
        this.fork = fork
        this.homepage = homepage
        this.stargazersCount = stargazersCount
        this.language = language
    }
}