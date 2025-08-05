package org.tsinjo.app.file.hash;

import org.tsinjo.app.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
