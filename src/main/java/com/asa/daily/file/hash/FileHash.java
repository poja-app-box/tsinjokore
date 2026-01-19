package com.asa.daily.file.hash;

import com.asa.daily.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
