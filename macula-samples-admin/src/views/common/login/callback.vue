<template>

</template>
<script>
export default{
    name: "callback",
    data(){
        return {
            
        }
    },
    methods: {
        generatorAccessToken () {
            if (window.location.hash.indexOf('access_token=') < 0) {
                this.$router.push({ path: '/login/logout' })
                return;
            }

            const keyWords = window.location.hash.split('#')[1].split('&')
            if (keyWords.length === 0) {
                this.$router.push({ path: '/login/logout' })
                return;
            }

            let accessToken = ''
            let expires_in = 0
            for (let i = 0; i < keyWords.length; i++) {
                if (keyWords[i].indexOf('access_token=') !== -1) {
                    accessToken = keyWords[i].split(/=(.+)/)[1]
                }
                if (keyWords[i].indexOf('expires_in=') !== -1) {
                    expires_in = keyWords[i].split(/=(\d+)/)[1]
                }
            }
            if (accessToken && expires_in) {
                this.$TOOL.cookie.set("TOKEN", accessToken, { expires: expires_in })
                const options = {
                    secure: true,
                    sameSite: 'none',
                    domain: '.infinitus.com.cn',
                    path: '/',
                    expires: expires_in
                };
                const VITE_COOKIE_KEY = `${import.meta.env.VITE_COOKIE_KEY}`;
                this.$TOOL.cookie.set(VITE_COOKIE_KEY, accessToken, options)
                this.$router.push({ path: '/login' })
                return;
            }
            this.$router.push({ path: '/login/logout' })
        }
    },
    async created(){
        this.generatorAccessToken()
    }
}
</script>
<style>
</style>