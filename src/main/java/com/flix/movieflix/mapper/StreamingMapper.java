package com.flix.movieflix.mapper;


import com.flix.movieflix.controller.request.StreamingRequest;
import com.flix.movieflix.controller.response.StreamingResponse;
import com.flix.movieflix.entity.Streaming;
import lombok.experimental.UtilityClass;

@UtilityClass //classe que nao pode ser instanciado
public class StreamingMapper {
    public static Streaming toStreaming(StreamingRequest streamingRequest) {
        return Streaming.builder().name(streamingRequest.name()).build();
    }

    public static StreamingResponse toStreamingResponse(Streaming streaming) {
        return StreamingResponse.builder().id(streaming.getId()).name(streaming.getName()).build();
    }
}
