package org.acme.kafka

import io.smallrye.mutiny.Uni
import io.smallrye.mutiny.uni
import jakarta.enterprise.context.ApplicationScoped
import org.acme.kafka.quarkus.Movie
import org.eclipse.microprofile.reactive.messaging.Incoming

@ApplicationScoped
class KotlinConsumer {
    @Incoming("movies-from-kafka")
    fun consumeContents(movie: Movie): Uni<out Any> {
        println("Received '${movie.title}' from ${movie.year}")
        return uni { }
    }

/*
    @Incoming("movies-from-kafka")
    suspend fun consumeContents(movie: Movie){
        println("Received '${movie.title}' from ${movie.year}")
    }
*/
}