package fr.simplex_software.llm.haiku;

import dev.langchain4j.service.*;
import io.quarkiverse.langchain4j.*;
import io.smallrye.mutiny.*;
import jakarta.enterprise.context.*;

@RegisterAiService
@ApplicationScoped
public interface HaikuService
{
  @SystemMessage("You are a professional haiku author")
  @UserMessage("Write a haiku about {subject} and store it in memory.")
  String writeHaiku(@MemoryId String memoryId, String subject);
  @UserMessage("What was the haiku you wrote ?")
  String lastHaiku(@MemoryId String memoryId);
}
