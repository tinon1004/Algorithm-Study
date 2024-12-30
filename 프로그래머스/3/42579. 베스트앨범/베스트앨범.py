def solution(genres, plays):
    
    genre_play_count = {}
    song_info = {}

    for i, (genre, play) in enumerate(zip(genres, plays)):
        if genre not in genre_play_count:
            genre_play_count[genre] = 0
            song_info[genre] = []
        genre_play_count[genre] += play
        song_info[genre].append((play, i))

    #재생 횟수 기준 정렬
    def genre_sort(genre):
        return genre_play_count[genre]
    sorted_genres = sorted(genre_play_count.keys(), key=genre_sort, reverse=True)

    #재생 횟수와 고유 번호로 정렬
    result = []
    for genre in sorted_genres:
        #재생 횟수 내림차순, 고유 번호 오름차순으로 정렬
        def sort_key(song):
            return (-song[0], song[1])
        songs = sorted(song_info[genre], key=sort_key)
        result.extend([song[1] for song in songs[:2]])

    return result