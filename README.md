# Leveraging the LLM Power in Java

Since its public release in November 2022, ChatGPT is fascinating millions of users and raises their creative power, while
catalyzing, in the same time, the tech enthusiasts attention on its possible drawbacks or even weaknesses.

ChatGPT and all the similar chatbots are part of a special software category called *Large Language Models* (LLM) that 
have dramatically metamorphosed the *Natural Language Processing* (NLP) field in order to provide newer and less common 
tasks like question answering, text generation and summarization, etc. All these terms really sound very complicated and, 
while it's a long way from this post's ambitions to elucidate the LLM's *quantum leap*, we're trying to look here at how 
they work and, especially, how could they be used in Java, highlighting their new compelling possibilities, as well as
some potential problems. Let's go !

## Short overview to LLMs

NLP refers to building machines able to recognize, understand and generate text in human languages. It might sound quite
a new technology for many of us, but it's old as computers themselves. As a matter of fact, automatically translating one
human language to another was the dream of any programmer in the beginning of the *information age*. 

In 1950, Alan Turing published a paper stating that a machine could have been considered as "intelligent" if it could 
produce responses indistinguishable from the ones of a human. This method, called today *the Turing test*, is now 
considered an incomplete case of the allegedly machines' "intelligence", since it's easily passed by modern programs, 
which mimic the human speach, while being unable of thinking.

The first NLP programs have adopted a simple approach of using sets of rules and heuristics in order to imitate conversations.
In 1966, Joseph Weizenbaum, professor at MIT, released the first chatbot in the history, named Eliza. Based on common
language pattern matching, this program used to create the illusion of a conversation by asking open-ended questions and
giving generic responses, like "Please go on", to sentences that it didn't "understand". 

Over the next several decades, rules-based text parsing and pattern matching remained the most common NLP approach. By the
1990s, an important paradigm shift has taken place in NLP, consisting in replacing the rule-based methods by statistical 
ones. As opposed to the old models trying to define and construct a grammar, the new ones were designed to "learn" language 
patterns through "training". Thousands of documents were now being used to feed data to NLP programs in order to "teach"
them a given language model. So, people started to "train" programs for text generation, classifications or other natural
languages tasks and, in the beginning, this process was based on input sequences that the model was splitting into *tokens*,
typically words or partial words, before being converted into the associated mathematical representation given by the 
training algorithm. Finally, this particular representation was converted back into tokens to produce a readble result. This
forth and back tokenization process is called *encoding-decoding*.

In 2014, NLP reasearchers found another alternative to this traditional approach of passing sequences through encoder-decoder
model, piece by piece. The new approach, which was called *attention*, consisted in having the decoder search the full input
sequence and trying to find the pieces which were the most relevant from the language model point of view. A few years latter,
a paper titled "Attention is all you need" (https://arxiv.org/abs/1706.03762), has been published by Google. It showed that 
models based on this new principle of attention were much faster and paralelizable. They were called *transformers*.

Transformers marked the begining of LLMs because they made possible to train models of much larger data sets. In 2018, OpenAI
introduced the first LLM called *Generative Pre Training* (GPT). This LLM was a transformer-based one that was trained using
massive amount of unlabeled data and then could be fine-tuned to specific tasks such that machine translation, text 
classification, sentiment analysis, and others. Another LLM introduced this same year, BERT (*Bidirectional Encoder 
Representation Transformer*), from Google, used an even larger amount of training data, consisting of billions of words and 
more than 100 million of parameters.

Unlike previous NLP programs, these LLMs aren't intended to be task specific. Instead, they are trained simply to predict the
token which fits the best, given the model's particular context. They are applied to different fields and are becomming an
integral part of our everyday live. Conversational agents like Siri from Apple, Alexa from Amazon or Google Home are able to
listen for queries, turn sounds into text and answer questions. Their general purpose and versatility result in a broad range
of natural language tasks, including but not limited to:
  - language modeling;
  - question answering;
  - coding;
  - content generation;
  - logical reasoning;
  - ...

## Conversational LLMs

The LLMs' undertaking consists in their capacity to generate text, in a highly flexible way, for a wide range of cases 
which makes them perfect in chating with humans. Chatbots are LLMs specifically designed for conversational use. ChatGPT
is probably one of the most known but there are many others like:
  - Bard from Google
  - Bing AI from Microsoft
  - LLaMa from Meta
  - Claude from Anthropic
  - Copilot from GitHub
  - ...

Embedded in enterprise grade applications, conversational LLMs are ideal solutions in fields like CRMs, customer-care, 
education, health, web content generation, chemistry, biology and many others. Chatbots and virtual assistants can be powered
by being given access to conversational LLMs capabilities. This kind of integration of LLMs in classical applications
requires the former to expose a consistent API (*Application Program Interface*).
