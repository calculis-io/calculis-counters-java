/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.calculis.counters.spi.alpha;

import io.humainary.counters.spi.CountersProvider;

import static io.humainary.spi.Providers.Factory;

/**
 * The SPI provider factory implementation of {@link ProviderFactory}.
 *
 * @author wlouth
 * @since 1.0
 */

public final class ProviderFactory
  implements Factory< CountersProvider > {

  @Override
  public CountersProvider create () {

    return
      new Provider ();

  }

}
