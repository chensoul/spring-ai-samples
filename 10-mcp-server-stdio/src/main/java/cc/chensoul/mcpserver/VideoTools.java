package cc.chensoul.mcpserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoTools {
    private static final Logger log = LoggerFactory.getLogger(VideoTools.class);

    private final VideoRepository videoRepository;

    public VideoTools(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Tool(name = "get_all_videos", description = "Get all videos")
    public List<Video> getAllVideos() {
        log.info("Getting all videos");
        return videoRepository.findAll();
    }

    @Tool(name = "search_videos", description = "Search videos by title")
    public List<Video> searchVideos(String title) {
        log.info("Searching videos by title: {}", title);
        return videoRepository.findByTitleContainingIgnoreCase(title);
    }

    @Tool(name = "get_video_by_title", description = "Get a single video by title")
    public Video getVideoByTitle(String title) {
        log.info("Getting video by title: {}", title);
        return videoRepository.findByTitle(title).orElse(null);
    }
}
