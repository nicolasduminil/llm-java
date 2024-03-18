package fr.simplex_software.llm.haiku;

import dev.langchain4j.service.*;
import io.quarkiverse.langchain4j.*;

@RegisterAiService
public interface HaikuService
{
  @SystemMessage("You are a professional haiku poet")
  @UserMessage("Write a haiku about {subject}.")
  String writeHaiku(String subject);
}
