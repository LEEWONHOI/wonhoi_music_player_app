package com.example.wonhoi_music_player_app3

import com.example.wonhoi_music_player_app3.service.MusicDto
import com.example.wonhoi_music_player_app3.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = this.streamUrl,
        coverUrl = this.coverUrl,
        track = this.track,
        artist = this.artist
    )

fun MusicDto.mapper() : PlayerModel =
    PlayerModel(
        playMusicList = this.musics.mapIndexed { id, musicEntity ->
            musicEntity.mapper(id.toLong()) // make List<MusicModel>
        }

    )