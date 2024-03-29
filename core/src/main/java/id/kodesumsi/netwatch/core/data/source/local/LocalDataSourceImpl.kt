package id.kodesumsi.netwatch.core.data.source.local

import id.kodesumsi.netwatch.core.data.source.local.entity.MovieEntity
import id.kodesumsi.netwatch.core.data.source.local.room.MovieDao
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Maybe

class LocalDataSourceImpl constructor(
    private val movieDao: MovieDao
): LocalDataSource {

    override fun getAllFavoriteMovies(): Flowable<List<MovieEntity>> {
        return movieDao.getAllFavoriteMovies()
    }

    override fun isFavorite(id: Int): Maybe<MovieEntity> {
        return movieDao.isFavorite(id)
    }

    override fun insertFavoriteMovie(movie: MovieEntity): Completable {
        return movieDao.insertFavoriteMovie(movie)
    }

    override fun removeFavoriteMovie(movie: MovieEntity): Completable {
        return movieDao.removeFavoriteMovie(movie)
    }
}