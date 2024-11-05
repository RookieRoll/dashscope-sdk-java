package com.alibaba.dashscope.embeddings;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public final class TextEmbeddingUsage {
  @SerializedName("total_tokens")
  private Integer totalTokens;
}
