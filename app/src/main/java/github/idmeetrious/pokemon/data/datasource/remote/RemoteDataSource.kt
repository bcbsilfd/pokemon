package github.idmeetrious.pokemon.data.datasource.remote

import github.idmeetrious.pokemon.domain.common.Result
import github.idmeetrious.pokemon.domain.entities.Pokemon
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single

interface RemoteDataSource {
    suspend fun getPokemon(id: Int): Result<Pokemon>
}