package com.compiler.server.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class CompileRequest(
    val files: List<ProjectFileRequestDto> = listOf(),
    val addClasspath: String = "",
)
