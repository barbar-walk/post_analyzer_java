# post_analyzer_java
Twitter 投稿解析器

## とりあえずやりたいこと

- 期間内の自分の投稿に対して、誰が、何件「いいね」をつけてくれたかカウントする。
- 「いいね」をつけてくれた方が、フォロワーなのか、相互フォローしているのか、通りすがりの方なのか、わかるようにする。
- カウント結果をCSVファイルでダウンロードする。

## 実現方法

- とりあえず、画面なし。WebAPIで提供。URLパラメータに「期間」と「TwitterID」入れてリクエストしたらCSVがダウンロードされる感じ。
  - Oauth不要のアプリにしたい。
    - アプリケーション単独認証 | Docs | Twitter Developer https://developer.twitter.com/ja/docs/authentication/oauth-2-0/application-only
      - 「アプリケーション単独認証」これが該当するっぽい。
      - 「Authentication methods supported by this endpoint」が「OAuth 2.0 Bearer token」だったらOauth不要。

- サーバ、かごや。
- アーキテクチャ、Java/Spring Boot
