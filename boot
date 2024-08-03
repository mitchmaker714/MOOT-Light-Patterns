export function beforeRender(delta) {
  t1 = time(0.1);
}

export function render(index) {
  v = wave(2 * (1 - t1) + index / pixelCount);

  v = pow(v, 5);

  s = v < 0.9;

  hsv(0, s, v);
}
